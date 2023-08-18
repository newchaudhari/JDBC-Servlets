<html>
<body>
<h1>Welcome to the JSP session</h1>

<h2>Scriptlet Tag</h2>
<%
   /* for (int i = 1; i <101 ; i++) {
        out.print(i+" ");
    }*/
    instanceMethod();
    staticMethod();
    out.println("instance variable "+number1);
    out.println("static variable "+number2);
%>

<h2>Declaration Tag</h2>
<%!
    int number1=100;
    static int number2=100;
public void instanceMethod(){
    System.out.println("instance Method");
}
static void staticMethod(){
    System.out.println("static method");
}

%>

<h2>Expression Tag</h2>
<%=
13*45
%>
<h2>tables</h2>

<%

        for (int row = 1; row <10 ; row++) {
        for (int column = 1; column <30 ; column++) {
        out.print(row *column+" ");

        }
        out.print();

        }
    %>
</body>
</html>
