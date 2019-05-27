
function encriptar(valor){
    
    var splitString = valor.split("");
    var reverseArray = splitString.reverse();
    var joinArray = reverseArray.join("");
    joinArray = "K7" +joinArray + "Up";
    
    //ENCRIPTAR LA CLAVE LLAMANDO
    md5(joinArray);
    var hash = md5.create();
    hash.update(joinArray);
    return hash.hex();
}

function antesDeEnviar(){
    
var passwd= document.getElementById("password").value;
document.getElementById("password_encrip").value = encriptar(passwd);
document.getElementById("password").value = "";

}

var form1 = document.getElementById("form1");
//LE PASAMOS LA REFERENCIA DE LA FUNCION, NO EL RESULTADO DE LA FUNCION
//FUNCION CALLBACK
form1.addEventListener("submit", antesDeEnviar);