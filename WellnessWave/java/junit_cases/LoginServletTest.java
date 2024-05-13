package junit_cases;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.*;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.junit.*;
import org.mockito.*;

public class LoginServletTest {

    @Mock
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;

    @Mock
    HttpSession session;

    @Mock
    UserService userService;

    @InjectMocks
    LoginServlet servlet;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoPost_SuccessfulLogin_RedirectToDashboard() throws ServletException, IOException {
        // Set up test data
        String username = "testUser";
        String password = "testPassword";
        User user = new User(username, password);

        // Mocking behavior
        when(request.getParameter("username")).thenReturn(username);
        when(request.getParameter("password")).thenReturn(password);
        when(userService.getUserByUsername(username)).thenReturn(Optional.of(user));
        when(request.getSession()).thenReturn(session);

        // Executing the doPost method
        servlet.doPost(request, response);

        // Verifying the behavior
        verify(session).setAttribute("loggedInUser", user);
        verify(response).sendRedirect(request.getContextPath() + "/dashboard");
    }

    @Test
    public void testDoPost_InvalidLogin_ShowErrorMessage() throws ServletException, IOException {
        // Set up test data
        String username = "testUser";
        String password = "testPassword";

        // Mocking behavior
        when(request.getParameter("username")).thenReturn(username);
        when(request.getParameter("password")).thenReturn(password);
        when(userService.getUserByUsername(username)).thenReturn(Optional.empty());

        // Executing the doPost method
        servlet.doPost(request, response);

        // Verifying the behavior
        verify(request).setAttribute("errorMessage", "Invalid username or password");
        verify(request.getRequestDispatcher("/WEB-INF/views/login.jsp")).forward(request, response);
    }

    // Add more test methods for other scenarios as needed
}