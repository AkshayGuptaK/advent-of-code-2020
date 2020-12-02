(ns advent-of-code-2020.utils.parser)

(require
 '[clojure.java.io :as io]
 '[clojure.string :as str])

(defn parse [day]
  (str/split (slurp (io/resource (str "day" day ".txt"))) #"\n" ))
