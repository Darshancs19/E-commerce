<%@page import="Dao.RegisterDao" %> <%@page contentType="text/html"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean class="Model.Register" id="R">
  <jsp:setProperty name="R" property="*"></jsp:setProperty>
</jsp:useBean>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta charset="utf-8" />
    <title>Sign Up Page</title>
    <link rel="shortcut icon" href="/assets/favicon.ico" />
    <link rel="stylesheet" href="css/main.css" />
    <link rel="stylesheet" href="./css/form.css" />
    <script src="js/main.js"></script>
    <script src="js/form.js"></script>
  </head>

  <body>
    <div class="container">
      <form class="form f-hidden" id="createAccount" method="post">
        <h1 class="ftitle">Create Account</h1>
        <div class="fmessage fmessage--error"></div>
        <div class="finput-group">
          <input
            type="text"
            name="signupUsername"
            id="signupUsername"
            pattern="(?=.*[a-z]).{10,}"
            title="Username must be 10 characters long"
            class="finput"
            autofocus
            placeholder="Username"
            required
          />
          <div class="finput-error-message"></div>
        </div>
        <div class="finput-group">
          <input
            type="email"
            id="email"
            name="email"
            class="finput"
            autofocus
            placeholder="Email Address"
            required
          />
          <div class="finput-error-message"></div>
        </div>
        <div class="finput-group">
          <input
            type="password"
            id="psw"
            name="psw"
            pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
            title="Must contain at
      least one number and one uppercase and lowercase letter, and at least 8
      or more characters"
            class="finput"
            autofocus
            placeholder="Password"
            required
          />
          <div class="finput-error-message"></div>
        </div>
        <div class="finput-group">
          <input
            type="password"
            id="confirm-password"
            name="confirm_password"
            class="finput"
            autofocus
            placeholder="Confirm password"
            onclick="return Validate()"
            required
          />
          <div class="finput-error-message"></div>
        </div>
        <button
          class="fbutton"
          type="submit"
          formaction="./registered.jsp"
          onclick="return Validate()"
        >
          Continue
        </button>

        <p class="ftext">
          <a class="flink" href="./index.jsp" id="linkLogin"
            >Already have an account? Sign in</a
          >
        </p>
        <h2 style="text-align: center">Signup with Social Media</h2>
        <!-- Add icon library -->
        <link
          rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
        />

        <!-- Add font awesome icons -->
        <a
          target="_blank"
          href="https://www.facebook.com"
          class="fa fa-facebook"
        ></a>
        <a
          target="_blank"
          href="https://twitter.com/"
          class="fa fa-twitter"
        ></a>
        <a
          target="_blank"
          href="https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue&ec=GAlAwAE&flowName=GlifWebSignIn&flowEntry=AddSession"
          class="fa fa-google"
        ></a>
        <a
          target="_blank"
          href="https://linkedin.com/"
          class="fa fa-linkedin"
        ></a>

        <div id="message_pass">
          <h3>Password must contain the following:</h3>
          <p id="letter" class="invalid">A <b>lowercase</b> letter</p>
          <p id="capital" class="invalid">
            A <b>capital (uppercase)</b> letter
          </p>
          <p id="number" class="invalid">A <b>number</b></p>
          <p id="length" class="invalid">Minimum <b>8 characters</b></p>
        </div>

        <div id="message_user">
          <h3>Username must be 10 characters long</h3>
          <p id="length" class="invalid">Minimum <b>10 characters</b></p>
        </div>
      </form>
    </div>
  </body>
</html>
