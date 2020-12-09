<%@page import="java.util.ArrayList"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="model.Item"%>
<%@page import="java.util.List"%>
<%@page import="controller.impl.ItemDAOImpl"%>
<div id="items">
	<%
		String itemName = request.getParameter("item_name");
	ItemDAOImpl itemDAOImpl = new ItemDAOImpl();

	List<Item> items = new ArrayList<Item>();
	if (itemName == null || itemName.equals("")) {
		items = itemDAOImpl.findAll();
	} else {
		items = itemDAOImpl.getItemByName(itemName);
	}
	Locale localeVN = new Locale("vi", "VN");
	NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
	for (int i = 0; i < items.size(); i++) {
		int stt = i + 1;
		Item item = items.get(i);
	%>
	<div class="item">
		<div class="itemImg">
			<img src="${pageContext.request.contextPath}/<%="img?url=" + item.getUrl()%>" alt="" width="200px"
				height="100%">
		</div>
		<div class="itemInfo">
			<div style="width: 5%; height: 100%; float: left">&nbsp;</div>
			<div style="width: 90%; height: 100%; float: left">
				<p class="itemName" style="font-weight: bold; height: 36px"><%=item.getName()%></p>
				<p class="itemAuthor"><%=item.getDescription()%></p>
				
				<form action="cart" method="POST">
					<label class="itemPrice" style="text-decoration: underline"><%=currencyVN.format(item.getSalePrice())%>
					</label> <input name="ItemID" hidden="true" value="<%=item.getId()%>">
					<input name="CustomerID" hidden="true"
						value="<%=session.getAttribute("customerID")%>"> <input
						type="submit" value="Add to Cart" style="float: right;">
				</form>
				
			</div>
			<div style="width: 50%; height: 100%; float: left">&nbsp;</div>
		</div>
	</div>
	<%
		}
	%>
</div>
<div style="clear: both">
	<br>
</div>
