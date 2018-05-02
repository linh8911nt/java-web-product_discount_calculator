<%--
  Created by IntelliJ IDEA.
  User: nguyenthanhlinh
  Date: 4/27/18
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
  .login {
    height:180px; width:230px;
    margin:0;
    padding:10px;
    border:1px #CCC solid;
  }
  .login input {
    padding:5px; margin:5px
  }
</style>
  <body>
  <form method="post" action="/login">
    <div class="login">
      <h2>Product Discount Calculator</h2>
      <input type="text" name="ProductDescription" size="30"  placeholder="ProductDescription" />
      <input type="text" name="ListPrice" size="30" placeholder="ListPrice" />
      <input type="text" name="DiscountPercent" size="30" placeholder="DiscountPercent" />
      <input type="submit" value="Calculate Discount"/>
    </div>
  </form>
  </body>
</html>
