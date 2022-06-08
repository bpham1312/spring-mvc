<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>The Band</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/asset/fonts/themify-icons/themify-icons.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/asset/css/client/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/asset/css/client/reponsive.css">
</head>

<body>
    <div id="main">
        <div id="header" class="close-menu">
            <ul class="list-nav">
                <li><a href="#" class="">home</a></li>
                <li><a href="#tour" class="">Cats</a></li>
                <li><a href="#contact" class="">contact</a></li>
                <li><a href="#" class="">more<i class="ti-angle-down"></i></a>
                    <ul class="subNav close-subNav">
                        <li class=""><a href="#" class="">Sale</a></li>
                        <li class=""><a href="#" class="">Top sellers</a></li>
                        <li class=""><a href="#" class="">New</a></li>
                    </ul>
                </li>
            </ul>
            <!-- <div class="clear"></div> -->
            <div class="btn-login">     	
            	<c:if test = "${user!=null}">
                	<i class="ti-user">${user}</i>
                	<c:if test = "${auth=='ADMIN'}">
            			<div class="sub-nav-user">
            				<a href="${pageContext.request.contextPath }/admin/species" class="">Dash board</a>
            			</div>
                	</c:if>
            		<div class="sub-nav-user">
            			<a href="${pageContext.request.contextPath }/logout" class="">Logout</a>
            		</div>	
                </c:if>
                
                <c:if test = "${username==null}">
            		<div class="login">
            			<a href="${pageContext.request.contextPath }/account/login" class="">Login</a>
            		</div>
                </c:if>
            </div>
            <div class="btn-sreach">
                <i class="ti-search"></i>
            </div>
            <div class="menu-btn">
                <i class="menu-icon ti-menu"></i>
            </div>
        </div>
        <div id="slide">
            <i class="btn-prev ti-angle-left"></i>
            <i class="btn-next ti-angle-right"></i>
            <div class="slide-text active">
                <h1 class="header-text">Cat</h1>
                <p class="body-text">Cat..........</p>
            </div>
            <div class="slide-text">
                <h1 class="header-text">Cat</h1>
                <p class="body-text">Cat..........</p>
            </div>
            <div class="slide-text">
                <h1 class="header-text">Cat</h1>
                <p class="body-text">Cat..........</p>
            </div>
            <div class="slide-text">
                <h1 class="header-text">Cat</h1>
                <p class="body-text">Cat..........</p>
            </div>
            <div class="container-image">
                <img class="slide-image" src="${pageContext.request.contextPath }/resources/asset/images/slide/slide1.jpg" alt="catshop">
                <img class="slide-image" src="${pageContext.request.contextPath }/resources/asset/images/slide/slide2.jpg" alt="catshop">
                <img class="slide-image" src="${pageContext.request.contextPath }/resources/asset/images/slide/slide3.jpg" alt="catshop">  
                <img class="slide-image" src="${pageContext.request.contextPath }/resources/asset/images/slide/slide4.jpg" alt="catshop">  
            </div>
        </div>
        <div id="body">           
            <div id="tour" class="body-tour">
                <div class="section-body">
                    <h1 class="header">List Cat</h1>
                    <p class="sub-header">Remember to buy cat!</p>
                    <div class="booking">
                    	<!-- -------------------------------- -->
                    	<c:forEach var="cats" items="${catsList}">
                        <div class="list-ticket">
                            <div class="ticket-item">
                                <img src="${pageContext.request.contextPath }/resources/uploads/${cats.image}" alt="img-cat" class="img-ticket">
                            </div>
                            <div class="ticket-detail">
                                <div class="head">${cats.species.name}</div>
                                <div class="name">${cats.name}</div>
                                <div class="decription">${cats.description}</div>
                                <button class="buy">Buy</button>
                            </div>
                        </div>
                        </c:forEach> 
                        <!-- -------------------------------- -->
                    </div>
                </div>
            </div>
            <div id="contact" class="body-contact">
                <div class="section-body">
                    <h1 class="header">CONTACT</h1>
                    <p class="sub-header">Client? Drop a note!</p>
                    <div class="container-contact">
                        <div class="infor-contact">
                            <i class="ti-location-pin"> Ho Chi Minh, VN</i>
                            <i class="ti-mobile"> Phone: +84 151515</i>
                            <i class="ti-email"> Email: mail@mail.com</i>
                        </div>
                        <form action="" class="form-contact">
                            <div class="two-column">
                                <input type="text" class="input-name" placeholder="Name">
                                <input type="email" class="email" placeholder="Email">
                            </div>
                            <div class="one-column">
                                <input type="text" placeholder="Message">
                            </div>
                            <button type="submit">send</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div id="footer">
            <div class="social">
                <a href="#"><i class="ti-facebook"></i></a>
                <a href="#"><i class="ti-instagram"></i></a>
                <a href="#"><i class="ti-youtube"></i></a>
                <a href="#"><i class="ti-pinterest"></i></a>
                <a href="#"><i class="ti-twitter"></i></a>
                <a href="#"><i class="ti-linkedin"></i></a>
            </div>
            <p class="coppy-right">Powered by <a href="#">w3.css</a></p>
        </div>
        <div class="js-modal">
            <div class="modal-box">
                <i class="ti-close btn-close"></i>
                <div class="header"><i class="modal-heading-icon ti-bag"></i>Pet
                </div>
                <div class="body">
                    <label for="ticket" class=""><i class="ti-bag"></i>Cats, $30</label>
                    <input type="text" id="ticket" class="input" placeholder="How many?">
                    <label for="email" class=""><i class="ti-user"></i>Send To</label>
                    <input type="text" id="email" class="input" placeholder="Enter Email">
                    <button class="pay">PAY<i class="ti-check"></i></button>
                    <p>Need <a href="#" class="help">help?</a></p>
                </div>
            </div>
        </div>
    </div>
    <script src="${pageContext.request.contextPath }/resources/asset/js/index.js"></script>
</body>

</html>