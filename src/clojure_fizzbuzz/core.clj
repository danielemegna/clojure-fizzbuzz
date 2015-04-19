(ns clojure-fizzbuzz.core
  (:gen-class))
 
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn this-function-exists []
  "Sure"
)

(defn fizzbuzz [number]
  
  (def dictionary {
    3 "Fizz"
    5 "Buzz"
  })


  (def result
    (str
      (if (= 0 (rem number 3)) (dictionary 3) "")
      (if (= 0 (rem number 5)) (dictionary 5) "")
    )
  )

  (if (clojure.string/blank? result)
    (str number)
    result
  )

)
