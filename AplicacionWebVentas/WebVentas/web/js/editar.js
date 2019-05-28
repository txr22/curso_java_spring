var alPulsarModificar = function () {
    antesDeEnviar();
    var nombre = document.getElementById("nombre").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password_encrip").value;
    var edad = document.getElementById("edad").value;
    var activo = document.getElementById("activo").checked;
    activo = activo ? "on" : "off";
    var cliente = {
        "nombre": nombre,
        email: email,
        'edad': edad
    };
    cliente.password = password;
    cliente["activo"] = activo;
    
    var clienteJSON = JSON.stringify(cliente);// Convertir obj en JSON
    alert("Enviando...\n" + clienteJSON);    
    
    // ActiveX para IE 7
    var peticionHTTP = new XMLHttpRequest(); // Objeto AJAX
    // ¿Que tiene que hacer al recibir la respuesta?
    peticionHTTP.onreadystatechange = function () {
        // alert("Ha cambiado de estado");
        if (this.readyState === 4 && this.status === 200) {
            alert("Hemos recibido algo!" + this.responseText);     
            
            //VAMOS A DESPARSEAR
            var jsonResp = this.responseText;
            var objResp = JSON.parse(jsonResp); //deserializar json en un objeto js
            //alert("email recibido -> "+ objResp["email"]);
            
            var spanId = document.getElementById("span_id");
            var spanNombre = document.getElementById("span_nombre");
            var spanEmail = document.getElementById("span_email");
            var spanEdad = document.getElementById("span_edad");
            var spanActivo = document.getElementById("span_activo");
            var spanPassword = document.getElementById("span_password");
            
         //   document.getElementById("cartel").innerHTML = "Nombre: "+objResp["nombre"]  +"<br> email: "+ objResp["email"] 
          //          + "<br> Id: "+ objResp["id"]+ "<br> Edad: "+ cliente.edad + "<br> Password: "+ objResp["password"];
            spanId.innerHTML = "Id: " + objResp["id"];
            spanNombre.innerHTML = "Nombre: "+objResp.nombre;
            spanEmail.innerHTML = "Email: " +objResp.email;
            spanEdad.innerHTML = "Edad: " + objResp.edad;
            spanActivo.innerHTML = "Activo: " + objResp.activo;
            spanPassword.innerHTML = "Password: " + objResp.password;
            
           
          
        } /*else {
            alert("Aun NO hemos recibido nada!");
        }*/
    };
    // Definimos la petición
    peticionHTTP.open("POST", "http://localhost:8084/WebVentas/clientes2.do", true);
    peticionHTTP.setRequestHeader("Content-type" , 
            "application/x-www-form-urlencoded");
    // lanzamos la petición
    var form1 = document.getElementById("form1");
    var formData = new FormData(form1);
    var cadenaEnvio = 
          "nombre=" + encodeURIComponent(document.getElementById("nombre").value)
          + "&email=" + encodeURIComponent(document.getElementById("email").value)
          + "&password_encrip=" + encodeURIComponent(document.getElementById("password_encrip").value)
          + "&activo=" + encodeURIComponent(document.getElementById("activo").value)
          + "&edad=" + encodeURIComponent(document.getElementById("edad").value);
    
    alert(cadenaEnvio);
         
    peticionHTTP.send(cadenaEnvio);
};
document.getElementById("btn_modificar").addEventListener("click", alPulsarModificar );