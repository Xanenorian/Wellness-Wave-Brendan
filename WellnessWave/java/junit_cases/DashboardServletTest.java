import static org.mockito.Mockito.*;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.junit.*;

public class DashboardServletTest {

    @Test
    public void testDoGet_UserNotLoggedIn_RedirectToLogin() throws ServletException, IOException {
        // Mocking servlet request and response objects
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);

        // Setting up mock behavior
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("loggedInUser")).thenReturn(null);
        when(request.getContextPath()).thenReturn("/webapp");
        when(request.getRequestDispatcher("/login")).thenReturn(dispatcher);

        // Creating servlet instance
        DashboardServlet servlet = new DashboardServlet();

        // Executing the doGet method
        servlet.doGet(request, response);

        // Verifying the behavior
        verify(response).sendRedirect("/webapp/login");
    }
}