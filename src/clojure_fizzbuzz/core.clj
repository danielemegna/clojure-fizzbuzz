(ns clojure-fizzbuzz.core
  (:gen-class))
 
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn this-function-exists []
  "Sure"
)

(defn multiple? [number divisor]
  (= 0 (rem number divisor))
)

(defn fizzbuzz [number]
  
  (def dictionary {
    3 "Fizz"
    5 "Buzz"
  })

  (def divisors (keys dictionary))
  (def divisors (filter #(multiple? number %) divisors))
  (def result (map dictionary divisors))
  (def result (reduce str result))

  (if (clojure.string/blank? result)
    (str number)
    result
  )

)

