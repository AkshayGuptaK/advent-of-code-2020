(ns advent-of-code-2020.core
  (:gen-class))

(require '[advent-of-code-2020.utils.parser :as parser]
              '[advent-of-code-2020.day1 :as day1])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (day1/part1 (parser/parse (first args)))))
