
var alPulsarModidicar = function (){
    antesDeEnviar();
    var nombre = document.getElementById("nombre").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password_encrip").value;
    var edad = document.getElementById("edad").value;
    var activo = document.getElementById("activo").checked;
    activo = activo ? "on" : "off";
    console.log(activo);
    
    var cliente = {
        
      "nombre" : nombre,
      "email" : email,
      "edad" : edad,
      "activo" : activo
    };
    cliente.password = password;
    cliente["activo"] = activo;

    var clienteJSON =JSON.stringify(cliente);//CONVERTIR EN JSON
    
    
    alert("Enviando.." + clienteJSON);
    //document.write(clienteJSON);
    
    //PARA HACER LA PETICION AJAX DEL OBJETO AJAX
    var peticionHTTP = new XMLHttpRequest();
    
    //CREAMOS LA FUNCION CALLBACK PARA CUANDO RECIBA LA RESPUESTA
    peticionHTTP.onreadystatechange = function (){
        alert("ha cambiado de estado");
        if(this.readyState === 4 && this.status === 200){
            alert("hemos recibido algo!" + this.responseText);
                    
        } else {
            alert("aun no hemos recibido na!!");
        }
    };
    //DEFINIMOS LA PETICION
    peticionHTTP.open("PUT", "http://localhost:8084/WebVentas/clientes2.do", true);
    //lanzamos la peticion
    peticionHTTP.send(null);
    
};

document.getElementById("btn_modificar").addEventListener("click", alPulsarModidicar);
