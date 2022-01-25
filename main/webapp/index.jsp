<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Электронная система "Больница"</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <style>
        section {
            padding-bottom: 50px
        }
    </style>
</head>

<body>
<fmt:setLocale value="${sessionScope.lang}"/>
<fmt:setBundle basename="messages"/>
<header>
    <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e3f2fd;">
        <div class="container">
            <a class="navbar-brand" href="#">
                <img src="images\logo.jpg" alt="image" width="60">
                Больница
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarScroll">
            <div class="mx-auto" style="width: 0px;"></div>
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">
                        <fmt:message key="label.main"/>
                    </a>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-bs-toggle="dropdown" aria-expanded="false">
                        <fmt:message key="label.opportunities"/>
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#">
                            <fmt:message key="label.doctor"/>
                        </a></li>
                        <li><a class="dropdown-item" href="#">
                            <fmt:message key="label.nurse"/>
                        </a></li>

                        <li><a class="dropdown-item" href="#">А
                            <fmt:message key="label.admin"/></a></li>
                    </ul>
                <li class="nav-item">
                    <a class="nav-link" href="#">
                        <fmt:message key="label.news"/>
                    </a>
                </li>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">
                        <fmt:message key="label.contacts"/>
                    </a>
                </li>

            </ul>

            <div class="form-floating">
                <select class="form-select form-select-sm" style="max-width:90%;" id="floatingSelect"
                        aria-label="Floating label select example">
                    <option selected value="rus">Русский</option>
                    <option value="eng">English</option>
                </select>
                <label for="floatingSelect">
                    <fmt:message key="label.language"/></label>
            </div>

            <form class="navbar-form navbar-right" action="controller" method="post">
                <div class="input-group mb-3">
                    <input type="hidden" name="command" value="signIn"/>
                    <input class="form-control form-control-sm" type="text" placeholder=<fmt:message key="label.login"/>/>
                    <input class="form-control form-control-sm" type="password" placeholder=<fmt:message key="label.password"/>/>
                    <button type="submit" class="btn btn-primary btn-sm">
                        <fmt:message key="label.sign_in"/>
                    </button>
                </div>
            </form>
            </div>
        </div>

    </nav>
</header>
<section>
    <div class="container">
        <div class="row align-items-center">
            <div class="col-6">
                <h1>
                    <fmt:message key="label.welcome"/>
                </h1>
            </div>
            <div class="col-6">
                <img class="w-100" src="images\main.jpg" alt="">
            </div>
        </div>
    </div>
</section>
<section>
    <div class="container">
        <h2>
            <fmt:message key="label.last_news"/>
        </h2>
        <div class="row">
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img src="..." class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">Заголовок новости</h5>

                        <a href="#" class="btn btn-primary">
                            <fmt:message key="label.details"/>
                        </a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img src="..." class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">Заголовок новости</h5>

                        <a href="#" class="btn btn-primary">
                            <fmt:message key="label.details"/>
                        </a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img src="..." class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">Заголовок новости</h5>

                        <a href="#" class="btn btn-primary">
                            <fmt:message key="label.details"/>
                        </a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <img src="..." class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">Заголовок новости</h5>

                        <a href="#" class="btn btn-primary">
                            <fmt:message key="label.details"/>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<footer class="d-flex flex-wrap justify-content-center align-items-center py-3 my-4 border-top">
    <p class="col-md-4 mb-0 text-muted">
        <fmt:message key="label.footer"/>
    </p>

</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>

</html>