(ns collection-check-test
  (:require
    [clojure.test :refer :all]
    [collection-check :refer :all]
    [simple-check.generators :as gen]))

(deftest test-identities
  (assert-vector-like 100 [] gen/int)
  (assert-set-like 100 #{} gen/int)
  (assert-map-like 100 {} gen/int gen/int))
