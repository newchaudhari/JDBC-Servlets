<html>
<body>
<h1 style="text-align: center; color: #ac1112">Tables From 1 to 50 </h1>
<table style="color: black; border-color: #e100df" border="5px">
    <%
        for (int rows = 1; rows <= 10
                ; rows++) {
    %>
    <tr>
        <%
            for (int column = 1; column <= 50; column++) {
        %>
        <td>
            <%=
            rows * column
            %>
        </td>
        <%
            }
        %>

    </tr>
    <%
        }
    %>


</table>

</body>
</html>
