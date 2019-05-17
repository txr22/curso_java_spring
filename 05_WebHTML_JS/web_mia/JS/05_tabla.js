
var lista = new Array();

function generarTabla(){

//console.log(lista[0]);
    var table = document.getElementsByTagName("table");
    table = table[0];
    
table.innerHTML="<caption>Tabla del formulario</caption>";
   
    table.innerHTML=`
                    <thead> 
                        <tr>
                            <th>Nick</th>
                            <th>Edad</th>
                           <th>Ciudad</th>
                            <th>Precio</th>
                        </tr>
                    </thead>`;
         
         for(var i = 0;i<lista.length;i++){
             
             var nodoTR = document.createElement("tr");
             
             table.appendChild(nodoTR);
             
             
             for(var columna of list[i]){
                 
                 var nodoColumna = document.createElement("td");
                 
                 nodoTR.appendChild(nodoColumna);
                 nodoColumna.innerHTML=lista[i];
                 
                
             }
             
             

         }
    

   
   }


function recoger(){
    
    var nick = document.getElementById("nick").value;
    var edad = document.getElementById("edad").value;
    var ciudad = document.getElementById("ciudad").value;
    var precio = document.getElementById("precio").value;
    
    var datosFila = [nick, edad, ciudad, precio];
    // añadimos los campos
    //lista[lista.length] = [nick, edad, ciudad, precio];
    lista.push([nick, edad, ciudad, precio]) ;
    //LLAMAMOS A LA FUNCION
    generarTabla();
}

