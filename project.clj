(defproject hotint "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [server-socket "1.0.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [org.clojure/java.jdbc "0.0.6"] 
                 [mysql/mysql-connector-java "5.1.25"]
                 [instaparse "1.3.6"]
                ]
  :main ^:skip-aot hotint.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
