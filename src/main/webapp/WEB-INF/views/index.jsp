<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>JSP</title>
</head>
<body>
    <p>Hello JSP!</p>
    <% if (request.getParameter("name") != null) { %>
        <p><%= request.getParameter("name") %>님 안녕하세요!</p>
    <%} else {%>
        <jsp:forward page="name.jsp" />
    <%} %>
    <p><%= request.getAttribute("data") %></p>
    <section>
        <form method="POST" style="display: flex; flex-direction: column; gap: 10px; padding: 10px; max-width: 240px; margin: auto;">
            <label>이름: <input name="name"></label>
            <label>주소: <input name="address"></label>
            <label>가격: <input name="price" type="number"></label>
            <button>등록</button>
        </form>
    </section>
    <%-- views 안에 있는 걸로 불러오면 되지롱... --%>
    <jsp:include page="footer.jsp" />
</body>
</html>
