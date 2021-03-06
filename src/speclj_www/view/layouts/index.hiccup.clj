(doctype :html5)
[:html
  [:head
    [:meta {:http-equiv "Content-Type" :content "text/html" :charset "utf-8"}]
    [:title "Clojure Testing Framework | Speclj"]
    (include-css "/stylesheets/reset.css")
    (include-css "/stylesheets/speclj.css")
    (include-css "/stylesheets/clojure_code_highlight.css")
    [:link {:rel "stylesheet" :type "text/css" :href "http://fonts.googleapis.com/css?family=Rosario:400,400italic"}]
    "<!--[if IE]>"
      "<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>"
    "<![endif]-->"]
  [:body
    [:div {:id "header"}
      [:div {:id "head_body"}
        [:a {:href "/"} [:img {:class "speclj" :src "/images/speclj.png"}]]
        [:p "a <abbr>TDD</abbr>/<abbr>BDD</abbr> framework for Clojure"]
        [:h4 "pronounced \"speckle\" [spec-uhl]"]]]
    [:div {:id "main"}
      [:div {:id "main_body"}
        [:div {:id "nav"}
          [:ul
            [:li [:a {:href "/install"} "Installation"]]
            [:li [:a {:href "/tutorial"} "Tutorial"]]
            [:li [:a {:href "/docs"} "Documentation"]]
            [:li [:a {:href "/plugins"} "Plugins"]]
            [:li [:a {:href "/community"} "Community"]]
            [:li [:a {:href "https://github.com/slagyr/speclj/issues" :target "_blank"} "Feature Requests"]]]]
        [:div {:id "content"}
          (eval (:template-body joodo.views/*view-context*))]]]
    [:div {:id "footer"}
      [:div {:id "foot_body"}
        [:span {:id "foot-links"}
          [:a {:href "/license"} "License Info"]
          " | "
          [:a {:href "https://github.com/slagyr/speclj/" :target "_blank"} "Git Repository"]]
        [:br]
        [:span "Copyright &copy; 2011 Micah Martin All Rights Reserved"]]]]]