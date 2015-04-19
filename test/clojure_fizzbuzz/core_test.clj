(ns clojure-fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [clojure-fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest we-can-call-core-functions
  (is (= "Sure" (this-function-exists)))
)

(deftest not-multiples-returns-number
  (is (= "1" (fizzbuzz 1)))
  (is (= "2" (fizzbuzz 2)))
  (is (= "4" (fizzbuzz 4)))
  (is (= "431" (fizzbuzz 431)))
)

(deftest multiples-of-three-should-returns-fizz
  (is (= "Fizz" (fizzbuzz 3)))
  (is (= "Fizz" (fizzbuzz 9)))
  (is (= "Fizz" (fizzbuzz 72)))
)

(deftest multiples-of-five-should-returns-buzz
  (is (= "Buzz" (fizzbuzz 5)))
  (is (= "Buzz" (fizzbuzz 10)))
  (is (= "Buzz" (fizzbuzz 50)))
  (is (= "Buzz" (fizzbuzz 175)))
)

(deftest multiples-of-three-and-five-should-returns-fizzbuzz
  (is (= "FizzBuzz" (fizzbuzz 15)))
  (is (= "FizzBuzz" (fizzbuzz 45)))
  (is (= "FizzBuzz" (fizzbuzz 90)))
  (is (= "FizzBuzz" (fizzbuzz 210)))
)
