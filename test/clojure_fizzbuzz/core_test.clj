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
