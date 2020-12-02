(ns advent-of-code-2020.core
  (:gen-class))

(require '[advent-of-code-2020.utils.parser :as parser])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (parser/parse args)))
