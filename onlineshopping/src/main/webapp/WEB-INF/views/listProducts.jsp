<div class="container">

	<div class="row">

		<!-- would display side-bar -->
		<div class="col-md-3">

			<%@ include file="./shared/sidebar.jsp"%>

		</div>

		<!-- display the actual products -->
		<div class="col-md-9">

			<!-- Added bread-crumb component -->
			<div class="row">

				<div class="col-lg-12">

					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item active"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">All Products</li>
						</ol>
					</c:if>
					
					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item active"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">Category</li>
							<li class="breadcrumb-item active">${category.name}</li>
						</ol>
					</c:if>					
				</div>

			</div>

		</div>
	</div>



</div>