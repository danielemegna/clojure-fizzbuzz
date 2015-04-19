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


  (def result "")
  (doseq [item dictionary]
    (if (multiple? number (key item))
      (def result (str result (val item)))
    )
  )

  (if (clojure.string/blank? result)
    (str number)
    result
  )

)

