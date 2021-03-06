(defproject fizzbuzz "0.1.0-SNAPSHOT"
  :description "fizzbuzz kata"
  :url "https://github.com/evandenrijd/fizzbuzz"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main fizzbuzz.core
  :aot [fizzbuzz.core]
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:dependencies [[speclj "3.3.2"]]}}
  :plugins [[speclj "3.3.2"]]
  :test-paths ["spec"])
