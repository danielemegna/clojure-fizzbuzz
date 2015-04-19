(ns clojure-fizzbuzz.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn this-function-exists []
  "Sure"
)

(defn fizzbuzz[number]
  (if (= 0 (rem number 3))
    "Fizz"
    (str number)
  )
)
