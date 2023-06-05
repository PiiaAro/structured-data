(ns structured-data)


(defn do-a-thing [x]
  (let [xsum (+ x x)]
    (Math/pow xsum xsum))) ;; OK


(defn cutify [v]
  (conj v "<3")) ;; OK


(defn spiff [v]
  (let [a (get v 0) b (get v 2)]
    (+ a b)))
   ;; OK


(defn spiff-destructuring [v]
  (let [[x y z] v]
  (+ x z))) ;; OK

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
  (let [[[x1 y1]
         [x2 y2]] rectangle]
    (- x2 x1))) ;; OK


(defn height [rectangle]
  (let [[[x1 y1]
         [x2 y2]] rectangle]
    (- y2 y1))) ;; OK


(defn square? [rectangle]
  (== (height rectangle) (width rectangle))) ;; OK

(defn area [rectangle]
  (* (height rectangle) (width rectangle)))
;; OK


(defn contains-point? [rectangle point]
  (let [[[x1 y1] [x2 y2]] rectangle
        [px py] point]
    (and (<= x1 px x2) (<= y1 py y2))))


(defn contains-rectangle? [outer inner]

  (let [[[x1 y1] [x2 y2]] inner]
    (and (contains-point? outer [x1 x2]) (contains-point? outer [y1 y2]))))



;; ;;;;; MAPS

;; (def china {:name "China Miéville", :birth-year 1972})
;; (def octavia {:name "Octavia E. Butler"
;;               :birth-year 1947
;;               :death-year 2006})
;; (def friedman {:name "Daniel Friedman" :birth-year 1944})
;; (def felleisen {:name "Matthias Felleisen"})

;; (def cities {:title "The City and the City" :authors [china]})
;; (def wild-seed {:title "Wild Seed", :authors [octavia]})
;; (def embassytown {:title "Embassytown", :authors [china]})
;; (def little-schemer {:title "The Little Schemer"
;;                      :authors [friedman, felleisen]})


(defn title-length [book]
  (count (:title book))
  )

(defn author-count [book]
  (count (:authors book)))

(defn multiple-authors? [book]
  (< 1 (author-count book)))


(defn add-author [book new-author]
 (assoc book :authors (conj (book :authors) new-author)))


(defn alive? [author]
  (if (contains? author :death-year)
    false))

(defn element-lengths [collection]
  :-)

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
