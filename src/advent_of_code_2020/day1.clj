(ns advent-of-code-2020.day1)

(defn- ingester [num-strs] (map #(Integer/parseInt %) num-strs))

(defn- differencesFromN [n nums]
  (set (map (partial - n) nums)))

(defn- productWithDifferenceFromN [nums n]
  (* (apply * nums) (- n (apply + nums))))

(defn- firstElemInSet [s v]
  (some #(when (contains? s %) %) v))

(defn- numberWithMatchToSumTo [nums n]
  (let [differences (differencesFromN n nums)]
  (firstElemInSet differences nums)))

(defn part1 [nums]
  (let [nums (ingester nums)
        matchingNumber (numberWithMatchToSumTo nums 2020)]
  (productWithDifferenceFromN [matchingNumber] 2020)))

(defn part2 [nums]
  (let [nums (ingester nums)
        differences (differencesFromN 2020 nums)
        matches (remove nil? (map (partial numberWithMatchToSumTo nums) differences))]
    (productWithDifferenceFromN (set matches) 2020)
))
