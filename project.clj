(defproject clojure-fizzbuzz "0.1.0-SNAPSHOT"
  :description "Exploring for the first time this programming language. A fizzbuzz TDD kata done in clojure."
  :url "about.me/danielemegna"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot clojure-fizzbuzz.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
