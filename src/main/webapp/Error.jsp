<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <title>Errore</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 50px;
        }
        .error-container {
            display: inline-block;
            text-align: left;
        }
        h1 {
            color: #FF0000;
        }
    </style>
</head>
<body>
    <div class="error-container">
        <h1>Oops! Qualcosa è andato storto.</h1>
        <p>Si è verificato un errore mentre tentavamo di elaborare la tua richiesta.</p>
        <p><a href="/">Torna alla home page</a></p>
    </div>
</body>
</html>
