import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webview)
        webView.webViewClient = WebViewClient()

        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        webSettings.domStorageEnabled = true

        val htmlContent = """
            
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Missing Persons/Cars</title>
  <link rel="stylesheet" href="sagini.css">
  <script src="https://unpkg.com/feather-icons"></script>
</head>
<body>
  <div class="header">  
    <div class="header__logo">
      <img src="images/Sagini logo.jpg" alt="Sagini Logo" class="headlogo-img">
      <strong> SAGINI SYSTEM</strong>
    </div>
    
    <nav class="navbar">
      <ul class="navbar__menu">
        <li class="navbar__item">
          <a class='navbar__link' href='/'><img src="images/feather/home.svg" alt="home Icon"><span>Home</span></a>
        </li>
        <li class="navbar__item">
          <a class='navbar__link' href="car.html"><img src="images/feather/truck.svg" alt="truck Icon"><span>CARS</span></a>
        </li>
        <li class="navbar__item">
          <a class='navbar__link' href="person.html"><img src="images/feather/users.svg" alt="users Icon"><span>Persons</span></a>
        </li>
        <li class="navbar__item">
          <a class='navbar__link' href="database.html"><img src="images/feather/folder.svg" alt="folder Icon"><span>Database</span></a>
        </li>
        <li class="navbar__item">
          <a class='navbar__link' href="#uploads.html"><img src="images/feather/upload.svg" alt="upload Icon"><span>Uploads</span></a>
        </li>
        <li class="navbar__item">
          <a class='navbar__link' href="profile.html"><img src="images/feather/user.svg" alt="map-pin Icon"><span>Profile</span></a>
        </li>
      </ul>
    </nav>
  </div>

  <section id="form-section">
    <h2>Welcome to  Sagini System</h2>
    <p>Select an option from the navbar to report missing persons, cars, or other objects.</p>
  </section>
  
  <script src="https://cdnjs.cloudflare.com/ajax/libs/firebase/7.14.1-0/firebase.js"></script>
  <script src="sagini.js"></script>
  <script>
    feather.replace();
  </script>
</body>
</html>
