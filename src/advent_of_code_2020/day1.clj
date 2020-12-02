(ns advent-of-code-2020.day1)

(defn- differencesFromN [n nums]
  (set (map (partial - n) nums)))

(defn- productWithDifferenceFromN [num n]
  (* num (- n num)))

(defn- firstElemInSet [s v]
  (some #(when (contains? s %) %) v))

(defn- ingester [num-strs] (map #(Integer/parseInt %) num-strs))

(defn part1 [nums]
  (let [nums (ingester nums)]
  (productWithDifferenceFromN (firstElemInSet (differencesFromN 2020 nums) nums) 2020)))
