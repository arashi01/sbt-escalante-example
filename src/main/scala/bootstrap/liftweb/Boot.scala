/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package bootstrap.liftweb

import net.liftweb.http.LiftRules
import net.liftweb.sitemap.{SiteMap, Loc, Menu}

/**
 * Lift boot class.
 *
 * @author Galder Zamarreño
 * @see This code is based on sample code provided in the
 *      <a href="https://github.com/lift/lift_24_sbt">Lift project templates</a>
 */
class Boot {

   def boot {
      LiftRules.addToPackages("io.escalante.quickstarts.lift.helloworld")

      // Build SiteMap
      val entries = Menu(Loc("Home", List("index"), "Home")) :: Nil
      LiftRules.setSiteMap(SiteMap(entries: _*))
   }

}
