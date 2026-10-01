import com.google.gson.Gson;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {



}
public void gestionarDatos(){
    Gson gson = new Gson();

    try {
        // Abrimos el fichero cines.json
        FileReader reader = new FileReader("ficheros/cines.json");
        // 3. convertimos el JSON completo en nuestro objeto raíz
        CajaCines datos = gson.fromJson(reader,CajaCines.class);
        System.out.println("Cines disponibles :");
        System.out.println("---------------------");

        if(datos.getCines()!=null && datos != null){

        }
        for(Cine cine : datos.getCines()){
            System.out.println(cine.getNombre());
        }

    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }

}