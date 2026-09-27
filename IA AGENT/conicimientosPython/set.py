# Los conjuntos (set) son colecciones sin orden y no permiten elementos duplicados.

utensilios = {"tenedor", "cuchara", "cuchillo"}
# Crea un conjunto llamado utensilios con tres elementos.

platos = {"plato", "bol", "taza"}
# Crea otro conjunto llamado platos con tres elementos.

# utensilios.add("cucharita")
# Añade "cucharita" al conjunto utensilios.

# utensilios.remove("cuchara")
# Elimina "cuchara" del conjunto utensilios.
# Da error si "cuchara" no existe.

# utensilios.pop()
# Elimina un elemento cualquiera del conjunto.
# No sabemos cuál elimina porque los conjuntos no tienen orden.

# utensilios.clear()
# Elimina todos los elementos de utensilios y deja el conjunto vacío.

# utensilios.update(platos)
# Añade a utensilios todos los elementos que están en platos.

# utensilios.difference(platos)
# Muestra los elementos que están en utensilios
# pero NO están en platos.

# utensilios.intersection(platos)
# Muestra los elementos repetidos: los que existen
# tanto en utensilios como en platos.