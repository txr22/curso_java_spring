
window.onload = function(){
    
var btn_reg = document.getElementById("btn_registro_ajax");
btn_reg.addEventListener("click", llamarAjax);
    //llamarAjax();
};

function llamarAjax(){
    
    var nombre = document.getElementById("nombre").value;
    var edad = document.getElementById("edad").value;
    var email = document.getElementById("email").value;
    var activo = document.getElementById("activo").checked;
    activo = activo ? "on" : "off";
    var cliente = {
        "nombre": nombre,
        "email": email,
        "edad": edad
    };
    cliente["activo"] = activo;
    
    var clienteJSON = JSON.stringify(cliente);// Convertir obj en JSON
    console.log(clienteJSON);
    alert("Enviando...\n" + clienteJSON);    
    
    // ActiveX para IE 7
    var peticionHTTP = new XMLHttpRequest(); // Objeto AJAX
    // ¿Que tiene que hacer al recibir la respuesta?
    peticionHTTP.onreadystatechange = function () {
        // alert("Ha cambiado de estado");
       
        //console.log(status);
        if (this.readyState === 4 && this.status === 200) {
            
            alert("Hemos recibido algo!" + this.responseText);     
            
            //VAMOS A DESPARSEAR
            var jsonResp = this.responseText;
            var objResp = JSON.parse(jsonResp); //deserializar json en un objeto js
            //alert("email recibido -> "+ objResp["email"]);
            alert("se ha recibido........ -> "+ objResp);
            
            var spanId = document.getElementById("span_id");
            var spanNombre = document.getElementById("span_nombre");
            var spanEmail = document.getElementById("span_email");
            var spanEdad = document.getElementById("span_edad");
            var spanActivo = document.getElementById("span_activo");
         
     
            spanId.innerHTML = "Id: " + objResp["id"];
            spanNombre.innerHTML = "Nombre: "+objResp.nombre;
            spanEmail.innerHTML = "Email: " +objResp.email;
            spanEdad.innerHTML = "Edad: " + objResp.edad;
            spanActivo.innerHTML = "Activo: " + objResp.activo;
            
            
           
          
        } /*else {
            alert("Aun NO hemos recibido nada!");
        }*/
    };
    // Definimos la petición
    peticionHTTP.open("POST", "/registro", true);
    peticionHTTP.setRequestHeader("Content-type" , 
            "application/json");
    // lanzamos la petición
    
    

    var cadenaEnvio = '{"nombre" : nombre,"email":email,"edad":edad,"activo":activo}';

    alert(cadenaEnvio);
         
    peticionHTTP.send(cadenaEnvio);
};
var btn_reg = document.getElementById("btn_registro_ajax");
btn_reg.addEventListener("click", llamarAjax);


    
