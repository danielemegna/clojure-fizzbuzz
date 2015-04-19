(ns clojure-fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [clojure-fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest we-can-call-core-functions
  (is (= "Sure" (this-function-exists)))
)
