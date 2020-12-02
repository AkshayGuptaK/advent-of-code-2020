(ns advent-of-code-2020.utils.parser)

(require '[clojure.java.io :as io])

(defn parse [[folder file]] (slurp (io/resource (str folder "/" file ".txt"))))
