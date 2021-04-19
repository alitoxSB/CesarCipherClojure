(def abecedario (seq "abcdefghijklmnopqrstuvwxyz"))
(print "Ingrese la palabra:")
(defn encriptar [texto valor]
  (let [cipher (->> (cycle abecedario)
                    (drop valor)
                    (take 26)
                    (zipmap abecedario))]
  (apply str (replace cipher texto))
  )
)
(encriptar (read-line) 1)

