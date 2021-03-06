# CHANGE LOG

# v2.5.5

* **NEW:** Receipts API.

# v2.5.4

* **NEW:** Transfer schedule APIs.
* **FIXED:** There is no `currency` field on TransferScheduling, it has been removed.

# v2.5.3

* **FIXED:** `installment_terms` are sent as `0` when not set. The field is now a boxed
  `Integer` so it defaults to `null` instead.

# v2.5.2

* **FIXED:** Added missing `TransferScheduling` type.
* **NEW:** Add `Schedule.charge.description` field.
* **NEW:** [Forex API](https://www.omise.co/forex-api).
* **NEW:** [Installments](https://www.omise.co/installment-payment).
* **NEW:** Support for fail-fast transfers.

# v2.5.1

* **NEW:** New `metadata` for Charge and Customer objects.

# v2.5.0

* **CHANGED:** Library now sends parameters using JSON encoding so that we can more easily
  support future APIs.
* **NEW:** [Schedules](https://www.omise.co/schedules-api) and
  [Occurrences](https://www.omise.co/occurrences-api) API.
* **NEW:** New offsite type: `alipay` for [Alipay](https://www.omise.co/alipay)

# v2.4.2

* **FIXED:** Initial CHANGELOG.md file creation.
