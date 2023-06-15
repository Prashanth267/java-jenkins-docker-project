package nithish.servlet.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import prashanth.job.com.Job;

public class JobDetailsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Job Details</title></head><body>");

        // Create job instances
        Job[] jobs = {
            new Job("Software Engineer", "ABC Corporation", "New York", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."),
            new Job("Web Developer", "XYZ Solutions", "San Francisco", "Praesent vel velit in lacus fringilla viverra."),
            new Job("Data Analyst", "123 Industries", "London", "Nullam sed nunc vitae lectus finibus aliquam."),
            new Job("Product Manager", "PQR Technologies", "Berlin", "Etiam sit amet leo a urna vestibulum tempor."),
            new Job("UX Designer", "Acme Corporation", "Tokyo", "Duis scelerisque magna eu ultrices fringilla.")
        };

        // Display the job details
        for (Job job : jobs) {
            out.println("<h1>" + job.getJobTitle() + "</h1>");
            out.println("<h2>" + job.getCompany() + " - " + job.getLocation() + "</h2>");
            out.println("<p>" + job.getDescription() + "</p>");
            out.println("<hr>");
        }

        out.println("</body></html>");
    }
}
