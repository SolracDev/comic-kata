import cucumber.api.PendingException

import static cucumber.api.groovy.EN.*

Given(~/^a client creates a reminder for "(.*?)"$/) { String comicName ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

Given(~/^a reminder for "(.*?)"$/) { String comicName ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

When(~/^he checks his reminders$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

When(~/^he checks the upcoming releases of his favourite comics$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

Then(~/^he would see an exception$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}


Then(~/^he would see$/) { String printedStatement ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

Given(~/^a marvel API witch returns the list of comics for the next month$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

Given(~/^a marvel API witch returns the list of comics for the next month but is slow$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

Then(~/^he would see an error in less than (\d+) seconds$/) { int seconds ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
