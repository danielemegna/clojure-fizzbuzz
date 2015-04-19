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

  (if (and (= 0 (rem number 3)) (= 0 (rem number 5)))
    (str (dictionary 3) (dictionary 5))
    (if (= 0 (rem number 3))
      (dictionary 3)
      (if (= 0 (rem number 5))
        (dictionary 5)
        (str number)
      )
    )
  )
)
