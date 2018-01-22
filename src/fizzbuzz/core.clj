(ns fizzbuzz.core)

(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 15)) "fizzbuzz"
    (= 0 (mod n 3)) "fizz"
    (= 0 (mod n 5)) "buzz"
    :else n
    ))

(defn fizzbuzz-upto [n]
  (map fizzbuzz (range 1 (inc n))))

(defn print-fizzbuzz-upto [n]
  (doseq [val (fizzbuzz-upto n)] (println val)))

(defn -main [& args]
  (print-fizzbuzz-upto 20))
