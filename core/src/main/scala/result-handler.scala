package com.rackspace.com.papi.components.checker

import com.rackspace.com.papi.components.checker.step.Result
import com.rackspace.com.papi.components.checker.servlet._

abstract class ResultHandler {
  def handle (req : CheckerServletRequest, resp : CheckerServletResponse, result : Result) : Unit
}
