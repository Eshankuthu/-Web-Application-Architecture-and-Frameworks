<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<html>
 
   <tiles:insertDefinition name="baseLayout">
    <tiles:putAttribute name="title"> products.title </tiles:putAttribute>
    <tiles:putAttribute name="heading"> products.heading </tiles:putAttribute>
    <tiles:putAttribute name="tagline"> products.tagline </tiles:putAttribute>
    <tiles:putAttribute name="body">

 
  	<section class="container">
		<div class="row">
			<c:forEach items="${products}" var="product">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
					<img src="<c:url value="/resource/images/${product.productId}.png"></c:url>" alt="image"  style = "width:100%"/>
						<div class="caption">
							<h3>${product.name}</h3>
							<p>${product.description}</p>
							<p><spring:eval expression =  "product.unitPrice" /><spring:message code="currency.type"/></p>
							<p>Available ${product.unitsInStock} units in stock</p>
							<p><spring:eval expression =  "product.activeDate" /></p>
							<p>
								<a
									href=" <spring:url value="/products/product?id=${product.productId}" /> "
									class="btn btn-primary"> <span
									class="glyphicon-info-sign glyphicon" /></span> Details
								</a>
							</p>

						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>

    </tiles:putAttribute>

</tiles:insertDefinition>


</html>
