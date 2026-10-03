package FicherosJson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ejemplo {
	public static void main(String[] args) {
		cargarDatos();
	}

	@SuppressWarnings("deprecation")
	public static void cargarDatos() {
		JsonParser parser = new JsonParser();
		try {
			FileReader reader = new FileReader("src/fichero.json");
			JsonElement datos = parser.parse(reader);
			System.out.println(datos.isJsonArray());

			JsonArray arraydatos = datos.getAsJsonArray();

			Iterator<JsonElement> it = arraydatos.iterator();
			JsonElement entrada = null;
			while (it.hasNext()) {
				entrada = it.next();
				if (entrada.isJsonObject()) {
					JsonObject objeto = entrada.getAsJsonObject();
					Set<Map.Entry<String, JsonElement>> entradas = objeto.entrySet();
					Iterator<Map.Entry<String, JsonElement>> iter = entradas.iterator();
					while (iter.hasNext()) {
						Map.Entry<String, JsonElement> entrada2 = iter.next();
						String attributo = entrada2.getKey();
						JsonElement valor = entrada2.getValue();
						System.out.println(attributo + " : " + valor);

					}

				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
