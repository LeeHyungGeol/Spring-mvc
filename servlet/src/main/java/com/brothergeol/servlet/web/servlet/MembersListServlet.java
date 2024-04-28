package com.brothergeol.servlet.web.servlet;

import com.brothergeol.servlet.domain.member.Member;
import com.brothergeol.servlet.domain.member.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "membersListServlet", urlPatterns = "/servlet/members")
public class MembersListServlet extends HttpServlet {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        List<Member> members = memberRepository.findAll();

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter writer = response.getWriter();
        writer.write("<html>");
        writer.write("<head>");
        writer.write("    <meta charset=\"UTF-8\">");
        writer.write("    <title>Title</title>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("<a href=\"/index.html\">메인</a>");
        writer.write("<table>");

        writer.write("<thead>");
        writer.write("<th>id</th>");
        writer.write("<th>username</th>");
        writer.write(" <th>age</th>");
        writer.write("</thead>");
/*
        writer.write("<tbody>");
        writer.write("<tr>");
        writer.write("<td>1</td>");
        writer.write(" <td>userA</td>");

        writer.write("        <td>10</td>");
        writer.write("    </tr>");
*/
        for (Member member : members) {
            writer.write("<tr>");
            writer.write(" <td>" + member.getId() + "</td>");
            writer.write("<td>" + member.getUsername() + "</td>");
            writer.write("<td>" + member.getAge() + "</td>");
            writer.write("  </tr>");
        }
        writer.write("</tbody>");
        writer.write("</table>");
        writer.write("</body>");
        writer.write("</html>");


    }
}
