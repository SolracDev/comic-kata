import cucumber.api.PendingException

import static cucumber.api.groovy.EN.*

Given(~/^a user who creates a reminder for "(.*?)"$/) { String comicName ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

Given(~/^a reminder for "(.*?)"$/) { String comicName ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

When(~/^the user lists his reminders$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

Given(~/^that no reminder has been added$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}


When(~/^the user checks the upcoming releases of his favourite comics$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

Then(~/^the user would see an exception$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}


Then(~/^the user would see$/) { String printedStatement ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

Given(~/^a marvel API witch returns the list of comics for the next month$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

Given(~/^a slow marvel API$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

Then(~/^the user would see an error whether the response time is high than (\d+) seconds$/) { int arg1 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
