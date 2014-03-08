(defproject semantic-om "0.0.1-SNAPSHOT"
  :description "Semantic-UI integrated with Clojurescript OM framework"
  :url "http://example.com/FIXME"
  :license {:name "The MIT License"
            :url "LICENSE"
            :distribution :repo}

  :min-lein-version "2.3.4"

  :source-paths ["src/clj" "src/cljs"]

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2156"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [om "0.4.2"]
                 [com.facebook/react "0.8.0"]]
  
  :plugins [[lein-cljsbuild "1.0.2"]]

  :hooks [leiningen.cljsbuild]

  :cljsbuild
  {:builds {:semantic-om
            {:source-paths ["src/cljs"]
             :compiler
             {:output-to "dev-resources/public/js/semantic_om.js"
              :optimizations :advanced
              :pretty-print false}}}})
