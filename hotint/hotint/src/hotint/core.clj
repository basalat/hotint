(use 'clojure.java.jdbc)


(ns hotint.core
	(:use server.socket)
	(:require [clojure.java.jdbc :as sql])
)

(def db {:classname "com.mysql.jdbc.Driver"
         :subprotocol "mysql"
         :subname "//198.204.228.250:36942/asterisk"
         :user "nripfida"
         :password "bngkerh@"})

(import '[java.io BufferedReader InputStreamReader OutputStreamWriter])


(defn list-users []
  (sql/with-connection db
    (sql/with-query-results rows
      ["select * from asterisk.company"]
      (println rows))))
      
(defn echo-server []
  (letfn [(echo [in out]
                    (binding [*in* (BufferedReader. (InputStreamReader. in))
                              *out* (OutputStreamWriter. out)]
                      (loop []
                        (let [input (read-line)]
                          (print input)
                          (flush))
                        (recur))))]
    (print 'starting 'on 925)
    (create-server 925 echo)))

(defn -main []
  (list-users)
  (echo-server))

