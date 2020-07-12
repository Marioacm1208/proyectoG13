<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="Controller?action=home">IE Electric Movility</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

    <div class="collapse navbar-collapse" id="navbarColor01">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="Controller?action=home">Start<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Controller?action=list">Shop</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Controller?action=home">Pricing</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">About Us</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="search?searchParams=advanced">Advanced Search</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Controller?action=login">Login</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0" action="search" method="get">
            <input class="form-control mr-sm-2" type="text" name="searchParams" placeholder="Type here">
            <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>